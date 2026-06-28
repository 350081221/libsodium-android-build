.class public Lio/reactivex/rxjava3/internal/functions/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/functions/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm3/g<",
        "Lorg/reactivestreams/q;",
        ">;"
    }
.end annotation


# instance fields
.field final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/reactivex/rxjava3/internal/functions/a$l;->a:I

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
.method public a(Lorg/reactivestreams/q;)V
    .locals 2

    iget v0, p0, Lio/reactivex/rxjava3/internal/functions/a$l;->a:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    check-cast p1, Lorg/reactivestreams/q;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/functions/a$l;->a(Lorg/reactivestreams/q;)V

    return-void
.end method
