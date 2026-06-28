.class public Lorg/greenrobot/greendao/rx/b;
.super Lorg/greenrobot/greendao/rx/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/greenrobot/greendao/rx/a;"
    }
.end annotation

.annotation build Lm4/b;
.end annotation


# instance fields
.field private final b:Lorg/greenrobot/greendao/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/greenrobot/greendao/a<",
            "TT;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/a<",
            "TT;TK;>;)V"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/greenrobot/greendao/rx/b;-><init>(Lorg/greenrobot/greendao/a;Lrx/Scheduler;)V

    return-void
.end method

.method public constructor <init>(Lorg/greenrobot/greendao/a;Lrx/Scheduler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/a<",
            "TT;TK;>;",
            "Lrx/Scheduler;",
            ")V"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    .line 2
    invoke-direct {p0, p2}, Lorg/greenrobot/greendao/rx/a;-><init>(Lrx/Scheduler;)V

    .line 3
    iput-object p1, p0, Lorg/greenrobot/greendao/rx/b;->b:Lorg/greenrobot/greendao/a;

    return-void
.end method

.method static synthetic d(Lorg/greenrobot/greendao/rx/b;)Lorg/greenrobot/greendao/a;
    .locals 0

    iget-object p0, p0, Lorg/greenrobot/greendao/rx/b;->b:Lorg/greenrobot/greendao/a;

    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$e;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$e;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs B([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lrx/Observable<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$f;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$f;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a()Lrx/Scheduler;
    .locals 1
    .annotation build Lm4/b;
    .end annotation

    invoke-super {p0}, Lorg/greenrobot/greendao/rx/a;->a()Lrx/Scheduler;

    move-result-object v0

    return-object v0
.end method

.method public e()Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrx/Observable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$o;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/b$o;-><init>(Lorg/greenrobot/greendao/rx/b;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$g;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$g;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public g()Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$i;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/b$i;-><init>(Lorg/greenrobot/greendao/rx/b;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$h;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$h;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TK;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$m;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$m;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs j([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TK;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$n;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$n;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$j;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$j;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs l([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lrx/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$l;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$l;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public m()Lorg/greenrobot/greendao/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/greenrobot/greendao/a<",
            "TT;TK;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/rx/b;->b:Lorg/greenrobot/greendao/a;

    return-object v0
.end method

.method public n(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$r;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$r;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$s;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$s;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs p([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lrx/Observable<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$t;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$t;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public q(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$u;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$u;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$v;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$v;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs s([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lrx/Observable<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$w;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$w;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$p;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$p;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public u()Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrx/Observable<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$k;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/b$k;-><init>(Lorg/greenrobot/greendao/rx/b;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method public v(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$q;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$q;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public w(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$a;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$a;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/lang/Iterable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Lrx/Observable<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$b;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$b;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Iterable;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public varargs y([Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lrx/Observable<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$c;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$c;-><init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/b$d;

    invoke-direct {v0, p0, p1}, Lorg/greenrobot/greendao/rx/b$d;-><init>(Lorg/greenrobot/greendao/rx/b;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method
