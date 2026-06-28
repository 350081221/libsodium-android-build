.class public final Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
.super Landroidx/compose/runtime/snapshots/StateRecord;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/SnapshotStateList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StateListStateRecord"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/compose/runtime/snapshots/StateRecord;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u00020\u0002B\u0017\u0008\u0000\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0012\"\u0004\u0008\u0017\u0010\u0014\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;",
        "T",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "value",
        "Lkotlin/r2;",
        "assign",
        "create",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;",
        "list",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;",
        "getList$runtime_release",
        "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;",
        "setList$runtime_release",
        "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V",
        "",
        "modification",
        "I",
        "getModification$runtime_release",
        "()I",
        "setModification$runtime_release",
        "(I)V",
        "structuralChange",
        "getStructuralChange$runtime_release",
        "setStructuralChange$runtime_release",
        "<init>",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,484:1\n82#2:485\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n77#1:485\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private modification:I

.field private structuralChange:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateRecord;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public assign(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 15
    .line 16
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .line 20
    .line 21
    iget v1, v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->modification:I

    .line 22
    .line 23
    iput v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->modification:I

    .line 24
    .line 25
    check-cast p1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .line 26
    .line 27
    iget p1, p1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->structuralChange:I

    .line 28
    .line 29
    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->structuralChange:I

    .line 30
    .line 31
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit v0

    .line 37
    throw p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public create()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;-><init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    return-object v0
.end method

.method public final getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    return-object v0
.end method

.method public final getModification$runtime_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->modification:I

    return v0
.end method

.method public final getStructuralChange$runtime_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->structuralChange:I

    return v0
.end method

.method public final setList$runtime_release(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->list:Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    return-void
.end method

.method public final setModification$runtime_release(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->modification:I

    return-void
.end method

.method public final setStructuralChange$runtime_release(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->structuralChange:I

    return-void
.end method
