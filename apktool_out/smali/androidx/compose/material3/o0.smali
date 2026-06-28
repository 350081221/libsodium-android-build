.class public final synthetic Landroidx/compose/material3/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:Lv3/l;


# direct methods
.method public synthetic constructor <init>(Lv3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/o0;->a:Lv3/l;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/o0;->a:Lv3/l;

    invoke-static {v0, p1, p2}, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1;->a(Lv3/l;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
