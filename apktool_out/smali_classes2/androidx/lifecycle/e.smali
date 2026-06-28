.class public final synthetic Landroidx/lifecycle/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/e0;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/flow/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/e;->a:Lkotlinx/coroutines/flow/e0;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/e;->a:Lkotlinx/coroutines/flow/e0;

    invoke-static {v0, p1, p2}, Landroidx/lifecycle/Lifecycle;->a(Lkotlinx/coroutines/flow/e0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
