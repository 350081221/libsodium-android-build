.class final Lio/reactivex/rxjava3/schedulers/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/schedulers/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/schedulers/c$b;

.field final synthetic b:Lio/reactivex/rxjava3/schedulers/c$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/schedulers/c$a;Lio/reactivex/rxjava3/schedulers/c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/schedulers/c$a$a;->b:Lio/reactivex/rxjava3/schedulers/c$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/schedulers/c$a$a;->a:Lio/reactivex/rxjava3/schedulers/c$b;

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

    iget-object v0, p0, Lio/reactivex/rxjava3/schedulers/c$a$a;->b:Lio/reactivex/rxjava3/schedulers/c$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/schedulers/c$a;->b:Lio/reactivex/rxjava3/schedulers/c;

    iget-object v0, v0, Lio/reactivex/rxjava3/schedulers/c;->b:Ljava/util/Queue;

    iget-object v1, p0, Lio/reactivex/rxjava3/schedulers/c$a$a;->a:Lio/reactivex/rxjava3/schedulers/c$b;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method
