.class public final synthetic Lkotlinx/coroutines/future/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:Lv3/p;


# direct methods
.method public synthetic constructor <init>(Lv3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/future/c;->a:Lv3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/future/c;->a:Lv3/p;

    check-cast p2, Ljava/lang/Throwable;

    invoke-static {v0, p1, p2}, Lkotlinx/coroutines/future/e;->a(Lv3/p;Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
