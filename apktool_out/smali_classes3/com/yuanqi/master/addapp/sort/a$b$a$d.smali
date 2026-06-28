.class final synthetic Lcom/yuanqi/master/addapp/sort/a$b$a$d;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/sort/a$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/p<",
        "Lorg/burnoutcrew/reorderable/d;",
        "Lorg/burnoutcrew/reorderable/d;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x2

    const-class v3, Lcom/yuanqi/master/addapp/AddAppViewModel;

    const-string v4, "move"

    const-string v5, "move(Lorg/burnoutcrew/reorderable/ItemPosition;Lorg/burnoutcrew/reorderable/ItemPosition;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/burnoutcrew/reorderable/d;

    check-cast p2, Lorg/burnoutcrew/reorderable/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/sort/a$b$a$d;->invoke(Lorg/burnoutcrew/reorderable/d;Lorg/burnoutcrew/reorderable/d;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lorg/burnoutcrew/reorderable/d;Lorg/burnoutcrew/reorderable/d;)V
    .locals 1
    .param p1    # Lorg/burnoutcrew/reorderable/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lorg/burnoutcrew/reorderable/d;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/q;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/addapp/AddAppViewModel;->P(Lorg/burnoutcrew/reorderable/d;Lorg/burnoutcrew/reorderable/d;)V

    return-void
.end method
