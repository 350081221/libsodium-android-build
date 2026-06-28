.class final Lorg/reactivestreams/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/reactivestreams/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/reactivestreams/p<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Flow$Subscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Flow$Subscriber<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Flow$Subscriber;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Flow$Subscriber<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

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
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

    invoke-static {v0}, Lorg/reactivestreams/i;->a(Ljava/util/concurrent/Flow$Subscriber;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

    invoke-static {v0, p1}, Lorg/reactivestreams/k;->a(Ljava/util/concurrent/Flow$Subscriber;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

    invoke-static {v0, p1}, Lorg/reactivestreams/h;->a(Ljava/util/concurrent/Flow$Subscriber;Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    iget-object v0, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/reactivestreams/a$d;

    invoke-direct {v1, p1}, Lorg/reactivestreams/a$d;-><init>(Lorg/reactivestreams/q;)V

    move-object p1, v1

    :goto_0
    invoke-static {v0, p1}, Lorg/reactivestreams/j;->a(Ljava/util/concurrent/Flow$Subscriber;Ljava/util/concurrent/Flow$Subscription;)V

    return-void
.end method
