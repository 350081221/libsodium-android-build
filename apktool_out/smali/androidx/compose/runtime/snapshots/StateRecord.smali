.class public abstract Landroidx/compose/runtime/snapshots/StateRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\u0008\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "",
        "value",
        "Lkotlin/r2;",
        "assign",
        "create",
        "",
        "snapshotId",
        "I",
        "getSnapshotId$runtime_release",
        "()I",
        "setSnapshotId$runtime_release",
        "(I)V",
        "next",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "getNext$runtime_release",
        "()Landroidx/compose/runtime/snapshots/StateRecord;",
        "setNext$runtime_release",
        "(Landroidx/compose/runtime/snapshots/StateRecord;)V",
        "<init>",
        "()V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private next:Landroidx/compose/runtime/snapshots/StateRecord;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private snapshotId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getId()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:I

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method


# virtual methods
.method public abstract assign(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .param p1    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract create()Landroidx/compose/runtime/snapshots/StateRecord;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public final getNext$runtime_release()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateRecord;->next:Landroidx/compose/runtime/snapshots/StateRecord;

    return-object v0
.end method

.method public final getSnapshotId$runtime_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:I

    return v0
.end method

.method public final setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/StateRecord;->next:Landroidx/compose/runtime/snapshots/StateRecord;

    return-void
.end method

.method public final setSnapshotId$runtime_release(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:I

    return-void
.end method
