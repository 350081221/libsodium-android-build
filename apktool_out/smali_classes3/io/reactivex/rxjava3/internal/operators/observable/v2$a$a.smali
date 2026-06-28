.class final Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/v2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/p0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2d2b4e5564d98c4aL


# instance fields
.field final synthetic this$0:Lio/reactivex/rxjava3/internal/operators/observable/v2$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/v2$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/observable/v2$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/observable/v2$a;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;->innerComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/observable/v2$a;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;->innerError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;->this$0:Lio/reactivex/rxjava3/internal/operators/observable/v2$a;

    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;->innerNext()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method
