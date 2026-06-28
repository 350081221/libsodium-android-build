.class public final Lio/reactivex/rxjava3/internal/util/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm3/g<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/util/g;->a:Lio/reactivex/rxjava3/disposables/e;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    check-cast p1, Lio/reactivex/rxjava3/disposables/e;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/util/g;->a(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method
