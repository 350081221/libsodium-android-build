.class public final synthetic Lkotlinx/coroutines/future/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/l2;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/l2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/future/d;->a:Lkotlinx/coroutines/l2;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/future/d;->a:Lkotlinx/coroutines/l2;

    check-cast p2, Ljava/lang/Throwable;

    invoke-static {v0, p1, p2}, Lkotlinx/coroutines/future/e;->b(Lkotlinx/coroutines/l2;Ljava/lang/Object;Ljava/lang/Throwable;)Lkotlin/r2;

    move-result-object p1

    return-object p1
.end method
