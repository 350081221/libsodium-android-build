.class final Landroidx/activity/compose/ReportDrawnComposition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0005\u001a\u00020\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001H\u0002J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR&\u0010\u0010\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/activity/compose/ReportDrawnComposition;",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "",
        "predicate",
        "observeReporter",
        "invoke",
        "removeReporter",
        "Landroidx/activity/FullyDrawnReporter;",
        "fullyDrawnReporter",
        "Landroidx/activity/FullyDrawnReporter;",
        "Lv3/a;",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "snapshotStateObserver",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "Lkotlin/Function1;",
        "checkReporter",
        "Lv3/l;",
        "<init>",
        "(Landroidx/activity/FullyDrawnReporter;Lv3/a;)V",
        "activity-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final checkReporter:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final fullyDrawnReporter:Landroidx/activity/FullyDrawnReporter;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final predicate:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/activity/FullyDrawnReporter;Lv3/a;)V
    .locals 2
    .param p1    # Landroidx/activity/FullyDrawnReporter;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/FullyDrawnReporter;",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/compose/ReportDrawnComposition;->fullyDrawnReporter:Landroidx/activity/FullyDrawnReporter;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/compose/ReportDrawnComposition;->predicate:Lv3/a;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 9
    .line 10
    sget-object v1, Landroidx/activity/compose/ReportDrawnComposition$snapshotStateObserver$1;->INSTANCE:Landroidx/activity/compose/ReportDrawnComposition$snapshotStateObserver$1;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;-><init>(Lv3/l;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->start()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 19
    .line 20
    new-instance v0, Landroidx/activity/compose/ReportDrawnComposition$checkReporter$1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroidx/activity/compose/ReportDrawnComposition$checkReporter$1;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->checkReporter:Lv3/l;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroidx/activity/FullyDrawnReporter;->addOnReportDrawnListener(Lv3/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/activity/FullyDrawnReporter;->isFullyDrawnReported()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/activity/FullyDrawnReporter;->addReporter()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p2}, Landroidx/activity/compose/ReportDrawnComposition;->observeReporter(Lv3/a;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
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

.method public static final synthetic access$observeReporter(Landroidx/activity/compose/ReportDrawnComposition;Lv3/a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/activity/compose/ReportDrawnComposition;->observeReporter(Lv3/a;)V

    return-void
.end method

.method private final observeReporter(Lv3/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/k1$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/activity/compose/ReportDrawnComposition;->snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/activity/compose/ReportDrawnComposition;->checkReporter:Lv3/l;

    .line 9
    .line 10
    new-instance v3, Landroidx/activity/compose/ReportDrawnComposition$observeReporter$1;

    .line 11
    .line 12
    invoke-direct {v3, v0, p1}, Landroidx/activity/compose/ReportDrawnComposition$observeReporter$1;-><init>(Lkotlin/jvm/internal/k1$a;Lv3/a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1, v2, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->observeReads(Ljava/lang/Object;Lv3/l;Lv3/a;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/activity/compose/ReportDrawnComposition;->removeReporter()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/compose/ReportDrawnComposition;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear()V

    .line 3
    iget-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->stop()V

    return-void
.end method

.method public final removeReporter()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->snapshotStateObserver:Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/activity/compose/ReportDrawnComposition;->predicate:Lv3/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->fullyDrawnReporter:Landroidx/activity/FullyDrawnReporter;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/activity/FullyDrawnReporter;->isFullyDrawnReported()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/activity/compose/ReportDrawnComposition;->fullyDrawnReporter:Landroidx/activity/FullyDrawnReporter;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/activity/FullyDrawnReporter;->removeReporter()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/activity/compose/ReportDrawnComposition;->invoke()V

    .line 22
    .line 23
    .line 24
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method
