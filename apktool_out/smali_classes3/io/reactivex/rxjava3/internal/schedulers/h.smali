.class public final Lio/reactivex/rxjava3/internal/schedulers/h;
.super Lio/reactivex/rxjava3/core/q0;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String; = "RxNewThreadScheduler"

.field private static final d:Lio/reactivex/rxjava3/internal/schedulers/k;

.field private static final e:Ljava/lang/String; = "rx3.newthread-priority"


# instance fields
.field final b:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "rx3.newthread-priority"

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 24
    .line 25
    const-string v2, "RxNewThreadScheduler"

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lio/reactivex/rxjava3/internal/schedulers/k;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lio/reactivex/rxjava3/internal/schedulers/h;->d:Lio/reactivex/rxjava3/internal/schedulers/k;

    .line 31
    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/schedulers/h;->d:Lio/reactivex/rxjava3/internal/schedulers/k;

    invoke-direct {p0, v0}, Lio/reactivex/rxjava3/internal/schedulers/h;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/q0;-><init>()V

    .line 3
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/schedulers/h;->b:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method


# virtual methods
.method public c()Lio/reactivex/rxjava3/core/q0$c;
    .locals 2
    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/schedulers/i;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/schedulers/h;->b:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/schedulers/i;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method
