.class final Lio/reactivex/rxjava3/internal/operators/single/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/single/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Throwable;

.field final synthetic b:Lio/reactivex/rxjava3/internal/operators/single/f$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/single/f$a;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;->b:Lio/reactivex/rxjava3/internal/operators/single/f$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;->a:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;->b:Lio/reactivex/rxjava3/internal/operators/single/f$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/single/f$a;->b:Lio/reactivex/rxjava3/core/u0;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/single/f$a$a;->a:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
