.class public Lorg/greenrobot/greendao/rx/c;
.super Lorg/greenrobot/greendao/rx/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/greenrobot/greendao/rx/a;"
    }
.end annotation

.annotation build Lm4/b;
.end annotation


# instance fields
.field private final b:Lorg/greenrobot/greendao/query/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/query/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/greenrobot/greendao/rx/a;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/greenrobot/greendao/rx/c;->b:Lorg/greenrobot/greendao/query/j;

    return-void
.end method

.method public constructor <init>(Lorg/greenrobot/greendao/query/j;Lrx/Scheduler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/greendao/query/j<",
            "TT;>;",
            "Lrx/Scheduler;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p2}, Lorg/greenrobot/greendao/rx/a;-><init>(Lrx/Scheduler;)V

    .line 4
    iput-object p1, p0, Lorg/greenrobot/greendao/rx/c;->b:Lorg/greenrobot/greendao/query/j;

    return-void
.end method

.method static synthetic d(Lorg/greenrobot/greendao/rx/c;)Lorg/greenrobot/greendao/query/j;
    .locals 0

    iget-object p0, p0, Lorg/greenrobot/greendao/rx/c;->b:Lorg/greenrobot/greendao/query/j;

    return-object p0
.end method


# virtual methods
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
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/c$a;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/c$a;-><init>(Lorg/greenrobot/greendao/rx/c;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method public f()Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/greenrobot/greendao/rx/c$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/c$c;-><init>(Lorg/greenrobot/greendao/rx/c;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lrx/Observable;->create(Lrx/Observable$OnSubscribe;)Lrx/Observable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->c(Lrx/Observable;)Lrx/Observable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
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
.end method

.method public g()Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/b;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/c$b;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/c$b;-><init>(Lorg/greenrobot/greendao/rx/c;)V

    invoke-virtual {p0, v0}, Lorg/greenrobot/greendao/rx/a;->b(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method
