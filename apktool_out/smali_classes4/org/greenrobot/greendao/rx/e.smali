.class Lorg/greenrobot/greendao/rx/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lm4/c;
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/util/concurrent/Callable;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lrx/Observable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lm4/c;
    .end annotation

    new-instance v0, Lorg/greenrobot/greendao/rx/e$a;

    invoke-direct {v0, p0}, Lorg/greenrobot/greendao/rx/e$a;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lrx/Observable;->defer(Lrx/functions/Func0;)Lrx/Observable;

    move-result-object p0

    return-object p0
.end method
