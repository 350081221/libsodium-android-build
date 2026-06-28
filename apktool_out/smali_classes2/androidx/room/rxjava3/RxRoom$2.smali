.class Landroidx/room/rxjava3/RxRoom$2;
.super Landroidx/room/InvalidationTracker$Observer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/rxjava3/RxRoom;->createObservable(Landroidx/room/RoomDatabase;[Ljava/lang/String;)Lio/reactivex/rxjava3/core/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$emitter:Lio/reactivex/rxjava3/core/k0;


# direct methods
.method constructor <init>([Ljava/lang/String;Lio/reactivex/rxjava3/core/k0;)V
    .locals 0

    iput-object p2, p0, Landroidx/room/rxjava3/RxRoom$2;->val$emitter:Lio/reactivex/rxjava3/core/k0;

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

    iget-object p1, p0, Landroidx/room/rxjava3/RxRoom$2;->val$emitter:Lio/reactivex/rxjava3/core/k0;

    sget-object v0, Landroidx/room/rxjava3/RxRoom;->NOTHING:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    return-void
.end method
