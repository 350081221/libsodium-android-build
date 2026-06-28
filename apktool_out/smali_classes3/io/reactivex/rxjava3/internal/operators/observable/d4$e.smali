.class final Lio/reactivex/rxjava3/internal/operators/observable/d4$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/d4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/internal/operators/observable/d4$d;

.field final b:J


# direct methods
.method constructor <init>(JLio/reactivex/rxjava3/internal/operators/observable/d4$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d4$e;->b:J

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/d4$e;->a:Lio/reactivex/rxjava3/internal/operators/observable/d4$d;

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
    .locals 3

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/d4$e;->a:Lio/reactivex/rxjava3/internal/operators/observable/d4$d;

    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/d4$e;->b:J

    invoke-interface {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/observable/d4$d;->onTimeout(J)V

    return-void
.end method
