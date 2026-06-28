.class final Lio/reactivex/rxjava3/internal/operators/observable/s2$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lm3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/s2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Ljava/lang/Runnable;",
        "Lm3/g<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3f2c4fd6dc101621L


# instance fields
.field connected:Z

.field disconnectedEarly:Z

.field final parent:Lio/reactivex/rxjava3/internal/operators/observable/s2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/s2<",
            "*>;"
        }
    .end annotation
.end field

.field subscriberCount:J

.field timer:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/s2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/s2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/s2;

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
.end method


# virtual methods
.method public accept(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 2
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 3
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/s2;

    monitor-enter p1

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->disconnectedEarly:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/s2;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/observable/s2;->a:Lio/reactivex/rxjava3/observables/a;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/observables/a;->T8()V

    .line 6
    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    check-cast p1, Lio/reactivex/rxjava3/disposables/e;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->accept(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/s2$a;->parent:Lio/reactivex/rxjava3/internal/operators/observable/s2;

    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/internal/operators/observable/s2;->K8(Lio/reactivex/rxjava3/internal/operators/observable/s2$a;)V

    return-void
.end method
