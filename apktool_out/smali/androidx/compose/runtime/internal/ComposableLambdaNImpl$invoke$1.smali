.class final Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/internal/ComposableLambdaNImpl;->invoke([Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/runtime/Composer;",
        "nc",
        "",
        "<anonymous parameter 1>",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/runtime/Composer;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n122#1:180,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $args:[Ljava/lang/Object;

.field final synthetic $realParams:I

.field final synthetic this$0:Landroidx/compose/runtime/internal/ComposableLambdaNImpl;


# direct methods
.method constructor <init>([Ljava/lang/Object;ILandroidx/compose/runtime/internal/ComposableLambdaNImpl;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$args:[Ljava/lang/Object;

    iput p2, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$realParams:I

    iput-object p3, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->this$0:Landroidx/compose/runtime/internal/ComposableLambdaNImpl;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object p2, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$args:[Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$realParams:I

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/s;->W1(II)Lkotlin/ranges/l;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/collections/l;->Rt([Ljava/lang/Object;Lkotlin/ranges/l;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    new-array v0, v1, [Ljava/lang/Object;

    .line 3
    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 4
    iget-object v0, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$args:[Ljava/lang/Object;

    iget v2, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$realParams:I

    add-int/lit8 v2, v2, 0x1

    aget-object v0, v0, v2

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    .line 5
    iget-object v3, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$args:[Ljava/lang/Object;

    array-length v3, v3

    iget v4, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$realParams:I

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x2

    new-array v4, v3, [Ljava/lang/Object;

    :goto_0
    if-ge v1, v3, :cond_0

    .line 6
    iget-object v5, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$args:[Ljava/lang/Object;

    iget v6, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->$realParams:I

    add-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v1

    aget-object v5, v5, v6

    invoke-static {v5, v2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1;->this$0:Landroidx/compose/runtime/internal/ComposableLambdaNImpl;

    .line 8
    new-instance v2, Lkotlin/jvm/internal/s1;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lkotlin/jvm/internal/s1;-><init>(I)V

    invoke-virtual {v2, p2}, Lkotlin/jvm/internal/s1;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/s1;->a(Ljava/lang/Object;)V

    or-int/lit8 p1, v0, 0x1

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 10
    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/s1;->a(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/s1;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/s1;->c()I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/s1;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 11
    invoke-virtual {v1, p1}, Landroidx/compose/runtime/internal/ComposableLambdaNImpl;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
