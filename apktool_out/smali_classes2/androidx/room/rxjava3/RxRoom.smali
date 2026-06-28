.class public final Landroidx/room/rxjava3/RxRoom;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NOTHING:Ljava/lang/Object;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/room/rxjava3/RxRoom;->NOTHING:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->lambda$createObservable$3(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V

    return-void
.end method

.method public static synthetic b(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->lambda$createFlowable$2(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->lambda$createFlowable$0(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V

    return-void
.end method

.method public static createFlowable(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/o;
    .locals 0
    .param p0    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP_PREFIX:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/room/RoomDatabase;",
            "Z[",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->getExecutor(Landroidx/room/RoomDatabase;Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/rxjava3/schedulers/b;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/rxjava3/core/q0;

    move-result-object p1

    .line 3
    invoke-static {p3}, Lio/reactivex/rxjava3/core/x;->E0(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/x;

    move-result-object p3

    .line 4
    invoke-static {p0, p2}, Landroidx/room/rxjava3/RxRoom;->createFlowable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/o;->P6(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    .line 6
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/o;->w8(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/o;->I4(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    new-instance p1, Landroidx/room/rxjava3/d;

    invoke-direct {p1, p3}, Landroidx/room/rxjava3/d;-><init>(Lio/reactivex/rxjava3/core/x;)V

    .line 8
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/o;->U2(Lm3/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    return-object p0
.end method

.method public static varargs createFlowable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p0    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomDatabase;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/rxjava3/c;

    invoke-direct {v0, p1, p0}, Landroidx/room/rxjava3/c;-><init>([Ljava/lang/String;Landroidx/room/RoomDatabase;)V

    sget-object p0, Lio/reactivex/rxjava3/core/b;->LATEST:Lio/reactivex/rxjava3/core/b;

    invoke-static {v0, p0}, Lio/reactivex/rxjava3/core/o;->G1(Lio/reactivex/rxjava3/core/r;Lio/reactivex/rxjava3/core/b;)Lio/reactivex/rxjava3/core/o;

    move-result-object p0

    return-object p0
.end method

.method public static createObservable(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/i0;
    .locals 0
    .param p0    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP_PREFIX:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/room/RoomDatabase;",
            "Z[",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->getExecutor(Landroidx/room/RoomDatabase;Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/rxjava3/schedulers/b;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/rxjava3/core/q0;

    move-result-object p1

    .line 3
    invoke-static {p3}, Lio/reactivex/rxjava3/core/x;->E0(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/x;

    move-result-object p3

    .line 4
    invoke-static {p0, p2}, Landroidx/room/rxjava3/RxRoom;->createObservable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/i0;->m6(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    .line 6
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/i0;->Q7(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/i0;->x4(Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    new-instance p1, Landroidx/room/rxjava3/b;

    invoke-direct {p1, p3}, Landroidx/room/rxjava3/b;-><init>(Lio/reactivex/rxjava3/core/x;)V

    .line 8
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/core/i0;->M2(Lm3/o;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    return-object p0
.end method

.method public static varargs createObservable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/i0;
    .locals 1
    .param p0    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomDatabase;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/rxjava3/core/i0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/rxjava3/g;

    invoke-direct {v0, p1, p0}, Landroidx/room/rxjava3/g;-><init>([Ljava/lang/String;Landroidx/room/RoomDatabase;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/core/i0;->B1(Lio/reactivex/rxjava3/core/l0;)Lio/reactivex/rxjava3/core/i0;

    move-result-object p0

    return-object p0
.end method

.method public static createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/r0;
    .locals 1
    .param p0    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP_PREFIX:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+TT;>;)",
            "Lio/reactivex/rxjava3/core/r0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Landroidx/room/rxjava3/f;

    invoke-direct {v0, p0}, Landroidx/room/rxjava3/f;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/core/r0;->R(Lio/reactivex/rxjava3/core/v0;)Lio/reactivex/rxjava3/core/r0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/concurrent/Callable;Lio/reactivex/rxjava3/core/t0;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->lambda$createSingle$6(Ljava/util/concurrent/Callable;Lio/reactivex/rxjava3/core/t0;)V

    return-void
.end method

.method public static synthetic e([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/k0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/rxjava3/RxRoom;->lambda$createObservable$4([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/k0;)V

    return-void
.end method

.method public static synthetic f(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/rxjava3/RxRoom;->lambda$createObservable$5(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/q;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/rxjava3/RxRoom;->lambda$createFlowable$1([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/q;)V

    return-void
.end method

.method private static getExecutor(Landroidx/room/RoomDatabase;Z)Ljava/util/concurrent/Executor;
    .locals 0
    .param p0    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/room/RoomDatabase;->getTransactionExecutor()Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/room/RoomDatabase;->getQueryExecutor()Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method private static synthetic lambda$createFlowable$0(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    return-void
.end method

.method private static synthetic lambda$createFlowable$1([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/rxjava3/RxRoom$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Landroidx/room/rxjava3/RxRoom$1;-><init>([Ljava/lang/String;Lio/reactivex/rxjava3/core/q;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lio/reactivex/rxjava3/core/q;->isCancelled()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, v0}, Landroidx/room/InvalidationTracker;->addObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Landroidx/room/rxjava3/a;

    .line 20
    .line 21
    invoke-direct {p0, p1, v0}, Landroidx/room/rxjava3/a;-><init>(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lio/reactivex/rxjava3/disposables/e;->p(Lm3/a;)Lio/reactivex/rxjava3/disposables/e;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p2, p0}, Lio/reactivex/rxjava3/core/q;->setDisposable(Lio/reactivex/rxjava3/disposables/e;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-interface {p2}, Lio/reactivex/rxjava3/core/q;->isCancelled()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    sget-object p0, Landroidx/room/rxjava3/RxRoom;->NOTHING:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {p2, p0}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
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
    .line 112
    .line 113
    .line 114
.end method

.method private static synthetic lambda$createFlowable$2(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-object p0
.end method

.method private static synthetic lambda$createObservable$3(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    return-void
.end method

.method private static synthetic lambda$createObservable$4([Ljava/lang/String;Landroidx/room/RoomDatabase;Lio/reactivex/rxjava3/core/k0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/rxjava3/RxRoom$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Landroidx/room/rxjava3/RxRoom$2;-><init>([Ljava/lang/String;Lio/reactivex/rxjava3/core/k0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/room/InvalidationTracker;->addObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Landroidx/room/rxjava3/e;

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Landroidx/room/rxjava3/e;-><init>(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationTracker$Observer;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lio/reactivex/rxjava3/disposables/e;->p(Lm3/a;)Lio/reactivex/rxjava3/disposables/e;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p2, p0}, Lio/reactivex/rxjava3/core/k0;->setDisposable(Lio/reactivex/rxjava3/disposables/e;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Landroidx/room/rxjava3/RxRoom;->NOTHING:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p2, p0}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
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
    .line 112
    .line 113
    .line 114
.end method

.method private static synthetic lambda$createObservable$5(Lio/reactivex/rxjava3/core/x;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/d0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-object p0
.end method

.method private static synthetic lambda$createSingle$6(Ljava/util/concurrent/Callable;Lio/reactivex/rxjava3/core/t0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/t0;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/room/rxjava3/EmptyResultSetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p0

    .line 10
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/t0;->tryOnError(Ljava/lang/Throwable;)Z

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
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
.end method
