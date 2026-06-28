.class public final synthetic Landroidx/compose/runtime/snapshots/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/snapshots/ObserverHandle;


# instance fields
.field public final synthetic a:Lv3/l;


# direct methods
.method public synthetic constructor <init>(Lv3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/b;->a:Lv3/l;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/b;->a:Lv3/l;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->b(Lv3/l;)V

    return-void
.end method
