.class Landroidx/room/rxjava3/RxRoom$1;
.super Landroidx/room/InvalidationTracker$Observer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/rxjava3/RxRoom;->createFlowable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$emitter:Lio/reactivex/rxjava3/core/q;


# direct methods
.method constructor <init>([Ljava/lang/String;Lio/reactivex/rxjava3/core/q;)V
    .locals 0

    iput-object p2, p0, Landroidx/room/rxjava3/RxRoom$1;->val$emitter:Lio/reactivex/rxjava3/core/q;

    invoke-direct {p0, p1}, Landroidx/room/InvalidationTracker$Observer;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onInvalidated(Ljava/util/Set;)V
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/room/rxjava3/RxRoom$1;->val$emitter:Lio/reactivex/rxjava3/core/q;

    .line 2
    .line 3
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/q;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/room/rxjava3/RxRoom$1;->val$emitter:Lio/reactivex/rxjava3/core/q;

    .line 10
    .line 11
    sget-object v0, Landroidx/room/rxjava3/RxRoom;->NOTHING:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
