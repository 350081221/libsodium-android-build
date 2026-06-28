.class public final synthetic Lcom/google/accompanist/permissions/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/Lifecycle$Event;

.field public final synthetic b:Lcom/google/accompanist/permissions/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/Lifecycle$Event;Lcom/google/accompanist/permissions/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/accompanist/permissions/j;->a:Landroidx/lifecycle/Lifecycle$Event;

    iput-object p2, p0, Lcom/google/accompanist/permissions/j;->b:Lcom/google/accompanist/permissions/e;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/permissions/j;->a:Landroidx/lifecycle/Lifecycle$Event;

    iget-object v1, p0, Lcom/google/accompanist/permissions/j;->b:Lcom/google/accompanist/permissions/e;

    invoke-static {v0, v1, p1, p2}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->b(Landroidx/lifecycle/Lifecycle$Event;Lcom/google/accompanist/permissions/e;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
