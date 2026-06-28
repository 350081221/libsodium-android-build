.class public final Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/sort/a$b$a$c;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/r<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
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
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n*L\n1#1,426:1\n149#2:427\n193#2:428\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;

.field final synthetic $state$inlined:Lorg/burnoutcrew/reorderable/j;


# direct methods
.method public constructor <init>(Ljava/util/List;Lorg/burnoutcrew/reorderable/j;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;->$state$inlined:Lorg/burnoutcrew/reorderable/j;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1    # Landroidx/compose/foundation/lazy/LazyItemScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x2db

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    .line 2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)"

    const v2, -0x25b7f321

    invoke-static {v2, v0, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;->$items:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    and-int/lit8 p4, v0, 0xe

    check-cast p2, Lcom/yuanqi/master/config/e;

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/sort/a$b$a$c$f;->$state$inlined:Lorg/burnoutcrew/reorderable/j;

    invoke-virtual {p2}, Lcom/yuanqi/master/config/e;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v0, Lcom/yuanqi/master/addapp/sort/a$b$a$c$b;

    invoke-direct {v0, p2}, Lcom/yuanqi/master/addapp/sort/a$b$a$c$b;-><init>(Lcom/yuanqi/master/config/e;)V

    const p2, 0x248fb76f

    const/4 v6, 0x1

    invoke-static {p3, p2, v6, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    const/high16 p2, 0x180000

    and-int/lit8 p4, p4, 0xe

    or-int/2addr p2, p4

    sget p4, Lorg/burnoutcrew/reorderable/j;->u:I

    shl-int/lit8 p4, p4, 0x3

    or-int v8, p2, p4

    const/16 v9, 0x1c

    move-object v0, p1

    move-object v7, p3

    invoke-static/range {v0 .. v9}, Lorg/burnoutcrew/reorderable/f;->a(Landroidx/compose/foundation/lazy/LazyItemScope;Lorg/burnoutcrew/reorderable/l;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;ZLv3/r;Landroidx/compose/runtime/Composer;II)V

    .line 4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    :goto_4
    return-void
.end method
