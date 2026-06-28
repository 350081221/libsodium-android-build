.class public abstract Landroidx/compose/runtime/snapshots/Snapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0019\u0008\u0004\u0012\u0006\u00107\u001a\u00020+\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u0008W\u0010XJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\u0008\u0010\u0008\u001a\u00020\u0007H&J$\u0010\u000c\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H \u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H \u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H \u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H \u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u000f\u0010*\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u000f\u0010.\u001a\u00020+H\u0000\u00a2\u0006\u0004\u0008,\u0010-R\"\u00100\u001a\u00020/8\u0010@\u0010X\u0090\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R*\u00107\u001a\u00020+2\u0006\u00106\u001a\u00020+8\u0016@PX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010-\"\u0004\u0008:\u0010;R\"\u0010<\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u001c\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008B\u00108\u0012\u0004\u0008C\u0010\u001fR$\u0010G\u001a\u00020+2\u0006\u0010D\u001a\u00020+8P@PX\u0090\u000e\u00a2\u0006\u000c\u001a\u0004\u0008E\u0010-\"\u0004\u0008F\u0010;R\u0014\u0010J\u001a\u00020\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u0014\u0010L\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010?R\u0015\u0010N\u001a\u00020\u00078\u00c0\u0002X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010?R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010PR\"\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010PR\u001c\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010S8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010U\u0082\u0001\u0004Z[\\]\u00a8\u0006^"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "",
        "Lkotlin/r2;",
        "dispose",
        "Lkotlin/Function1;",
        "readObserver",
        "takeNestedSnapshot",
        "",
        "hasPendingChanges",
        "T",
        "Lkotlin/Function0;",
        "block",
        "enter",
        "(Lv3/a;)Ljava/lang/Object;",
        "makeCurrent",
        "snapshot",
        "restoreCurrent",
        "unsafeEnter",
        "oldSnapshot",
        "unsafeLeave",
        "nestedActivated$runtime_release",
        "(Landroidx/compose/runtime/snapshots/Snapshot;)V",
        "nestedActivated",
        "nestedDeactivated$runtime_release",
        "nestedDeactivated",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "state",
        "recordModified$runtime_release",
        "(Landroidx/compose/runtime/snapshots/StateObject;)V",
        "recordModified",
        "notifyObjectsInitialized$runtime_release",
        "()V",
        "notifyObjectsInitialized",
        "closeAndReleasePinning$runtime_release",
        "closeAndReleasePinning",
        "closeLocked$runtime_release",
        "closeLocked",
        "releasePinnedSnapshotsForCloseLocked$runtime_release",
        "releasePinnedSnapshotsForCloseLocked",
        "validateNotDisposed$runtime_release",
        "validateNotDisposed",
        "releasePinnedSnapshotLocked$runtime_release",
        "releasePinnedSnapshotLocked",
        "",
        "takeoverPinnedSnapshot$runtime_release",
        "()I",
        "takeoverPinnedSnapshot",
        "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
        "invalid",
        "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
        "getInvalid$runtime_release",
        "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
        "setInvalid$runtime_release",
        "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V",
        "<set-?>",
        "id",
        "I",
        "getId",
        "setId$runtime_release",
        "(I)V",
        "disposed",
        "Z",
        "getDisposed$runtime_release",
        "()Z",
        "setDisposed$runtime_release",
        "(Z)V",
        "pinningTrackingHandle",
        "getPinningTrackingHandle$annotations",
        "value",
        "getWriteCount$runtime_release",
        "setWriteCount$runtime_release",
        "writeCount",
        "getRoot",
        "()Landroidx/compose/runtime/snapshots/Snapshot;",
        "root",
        "getReadOnly",
        "readOnly",
        "isPinned$runtime_release",
        "isPinned",
        "getReadObserver$runtime_release",
        "()Lv3/l;",
        "getWriteObserver$runtime_release",
        "writeObserver",
        "Landroidx/compose/runtime/collection/IdentityArraySet;",
        "getModified$runtime_release",
        "()Landroidx/compose/runtime/collection/IdentityArraySet;",
        "modified",
        "<init>",
        "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V",
        "Companion",
        "Landroidx/compose/runtime/snapshots/MutableSnapshot;",
        "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;",
        "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;",
        "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;",
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
        "SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#2:2295\n1714#2:2297\n82#3:2296\n82#3:2298\n1#4:2299\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n91#1:2295\n241#1:2297\n91#1:2296\n241#1:2298\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private disposed:Z

.field private id:I

.field private invalid:Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private pinningTrackingHandle:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/snapshots/Snapshot;->$stable:I

    return-void
.end method

.method private constructor <init>(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/runtime/snapshots/Snapshot;->invalid:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 5
    .line 6
    iput p1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->id:I

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getInvalid$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->trackPinning(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, -0x1

    .line 20
    :goto_0
    iput p1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    .line 21
    .line 22
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
.end method

.method public synthetic constructor <init>(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/snapshots/Snapshot;-><init>(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V

    return-void
.end method

.method public static final synthetic access$getPinningTrackingHandle$p(Landroidx/compose/runtime/snapshots/Snapshot;)I
    .locals 0

    iget p0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    return p0
.end method

.method private static synthetic getPinningTrackingHandle$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic takeNestedSnapshot$default(Landroidx/compose/runtime/snapshots/Snapshot;Lv3/l;ILjava/lang/Object;)Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/Snapshot;->takeNestedSnapshot(Lv3/l;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: takeNestedSnapshot"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final closeAndReleasePinning$runtime_release()V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->closeLocked$runtime_release()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->releasePinnedSnapshotsForCloseLocked$runtime_release()V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0

    .line 18
    throw v1
    .line 19
.end method

.method public closeLocked$runtime_release()V
    .locals 2

    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getOpenSnapshots$p()Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$setOpenSnapshots$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V

    return-void
.end method

.method public dispose()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->disposed:Z

    .line 3
    .line 4
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->releasePinnedSnapshotLocked$runtime_release()V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0

    .line 18
    throw v1
    .line 19
.end method

.method public final enter(Lv3/a;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 28
    .line 29
    .line 30
    throw p1
    .line 31
    .line 32
.end method

.method public final getDisposed$runtime_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->disposed:Z

    return v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->id:I

    return v0
.end method

.method public getInvalid$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->invalid:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v0
.end method

.method public abstract getModified$runtime_release()Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Landroidx/compose/runtime/snapshots/StateObject;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getReadObserver$runtime_release()Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getReadOnly()Z
.end method

.method public abstract getRoot()Landroidx/compose/runtime/snapshots/Snapshot;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public getWriteCount$runtime_release()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract getWriteObserver$runtime_release()Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract hasPendingChanges()Z
.end method

.method public final isPinned$runtime_release()Z
    .locals 1

    invoke-static {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->access$getPinningTrackingHandle$p(Landroidx/compose/runtime/snapshots/Snapshot;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 2
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getThreadSnapshot$p()Landroidx/compose/runtime/SnapshotThreadLocal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/SnapshotThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/runtime/snapshots/Snapshot;

    .line 10
    .line 11
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getThreadSnapshot$p()Landroidx/compose/runtime/SnapshotThreadLocal;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/SnapshotThreadLocal;->set(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
.end method

.method public abstract nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .param p1    # Landroidx/compose/runtime/snapshots/Snapshot;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .param p1    # Landroidx/compose/runtime/snapshots/Snapshot;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract notifyObjectsInitialized$runtime_release()V
.end method

.method public abstract recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)V
    .param p1    # Landroidx/compose/runtime/snapshots/StateObject;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public final releasePinnedSnapshotLocked$runtime_release()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->releasePinningLocked(I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public releasePinnedSnapshotsForCloseLocked$runtime_release()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->releasePinnedSnapshotLocked$runtime_release()V

    return-void
.end method

.method public restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 1
    .param p1    # Landroidx/compose/runtime/snapshots/Snapshot;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getThreadSnapshot$p()Landroidx/compose/runtime/SnapshotThreadLocal;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/SnapshotThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDisposed$runtime_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->disposed:Z

    return-void
.end method

.method public setId$runtime_release(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->id:I

    return-void
.end method

.method public setInvalid$runtime_release(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->invalid:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-void
.end method

.method public setWriteCount$runtime_release(I)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Updating write count is not supported for this snapshot"

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p1
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

.method public abstract takeNestedSnapshot(Lv3/l;)Landroidx/compose/runtime/snapshots/Snapshot;
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/runtime/snapshots/Snapshot;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public final takeoverPinnedSnapshot$runtime_release()I
    .locals 2

    iget v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    const/4 v1, -0x1

    iput v1, p0, Landroidx/compose/runtime/snapshots/Snapshot;->pinningTrackingHandle:I

    return v0
.end method

.method public final unsafeEnter()Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 1
    .annotation build Landroidx/compose/runtime/ExperimentalComposeApi;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v0

    return-object v0
.end method

.method public final unsafeLeave(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 1
    .param p1    # Landroidx/compose/runtime/snapshots/Snapshot;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ExperimentalComposeApi;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getThreadSnapshot$p()Landroidx/compose/runtime/SnapshotThreadLocal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/SnapshotThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v0, "Cannot leave snapshot; "

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " is not the current snapshot"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public final validateNotDisposed$runtime_release()V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/Snapshot;->disposed:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot use a disposed snapshot"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
