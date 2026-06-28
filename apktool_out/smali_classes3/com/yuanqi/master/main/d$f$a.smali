.class final Lcom/yuanqi/master/main/d$f$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/d$f;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
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
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
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
        "SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,349:1\n450#2,14:350\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n*L\n126#1:350,14\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $mainViewModel:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/main/d$f$a;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/main/d$f$a;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V
    .locals 9
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$LazyVerticalGrid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/main/d$f$a;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/main/MainViewModel;->G()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/master/main/d$f$a;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    .line 3
    sget-object v2, Lcom/yuanqi/master/main/d$f$a$e;->INSTANCE:Lcom/yuanqi/master/main/d$f$a$e;

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 5
    new-instance v7, Lcom/yuanqi/master/main/d$f$a$h;

    invoke-direct {v7, v2, v0}, Lcom/yuanqi/master/main/d$f$a$h;-><init>(Lv3/l;Ljava/util/List;)V

    .line 6
    new-instance v2, Lcom/yuanqi/master/main/d$f$a$i;

    invoke-direct {v2, v0, v1}, Lcom/yuanqi/master/main/d$f$a$i;-><init>(Ljava/util/List;Lcom/yuanqi/master/main/MainViewModel;)V

    const v0, 0x29b3c0fe

    const/4 v1, 0x1

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v8

    move-object v3, p1

    .line 7
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILv3/l;Lv3/p;Lv3/l;Lv3/r;)V

    return-void
.end method
