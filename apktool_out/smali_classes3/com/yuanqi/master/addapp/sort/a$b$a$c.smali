.class final Lcom/yuanqi/master/addapp/sort/a$b$a$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/sort/a$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,212:1\n139#2,12:213\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n*L\n148#1:213,12\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dataList:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/master/config/e;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $state:Lorg/burnoutcrew/reorderable/j;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lorg/burnoutcrew/reorderable/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/master/config/e;",
            ">;>;",
            "Lorg/burnoutcrew/reorderable/j;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c;->$dataList:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c;->$state:Lorg/burnoutcrew/reorderable/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/sort/a$b$a$c;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 6
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c;->$dataList:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v1, Lcom/yuanqi/master/addapp/sort/a$b$a$c$a;->INSTANCE:Lcom/yuanqi/master/addapp/sort/a$b$a$c$a;

    iget-object v2, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c;->$state:Lorg/burnoutcrew/reorderable/j;

    .line 3
    sget-object v3, Lcom/yuanqi/master/addapp/sort/a$b$a$c$c;->INSTANCE:Lcom/yuanqi/master/addapp/sort/a$b$a$c$c;

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-eqz v1, :cond_0

    .line 5
    new-instance v5, Lcom/yuanqi/master/addapp/sort/a$b$a$c$d;

    invoke-direct {v5, v1, v0}, Lcom/yuanqi/master/addapp/sort/a$b$a$c$d;-><init>(Lv3/l;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    new-instance v1, Lcom/yuanqi/master/addapp/sort/a$b$a$c$e;

    invoke-direct {v1, v3, v0}, Lcom/yuanqi/master/addapp/sort/a$b$a$c$e;-><init>(Lv3/l;Ljava/util/List;)V

    .line 6
    new-instance v3, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;

    invoke-direct {v3, v0, v2}, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;-><init>(Ljava/util/List;Lorg/burnoutcrew/reorderable/j;)V

    const v0, -0x25b7f321

    const/4 v2, 0x1

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    .line 7
    invoke-interface {p1, v4, v5, v1, v0}, Landroidx/compose/foundation/lazy/LazyListScope;->items(ILv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method
