.class Lorg/greenrobot/greendao/rx/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/greenrobot/greendao/rx/d;->e(Ljava/util/concurrent/Callable;)Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Callable;

.field final synthetic b:Lorg/greenrobot/greendao/rx/d;


# direct methods
.method constructor <init>(Lorg/greenrobot/greendao/rx/d;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lorg/greenrobot/greendao/rx/d$b;->b:Lorg/greenrobot/greendao/rx/d;

    iput-object p2, p0, Lorg/greenrobot/greendao/rx/d$b;->a:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/rx/d$b;->b:Lorg/greenrobot/greendao/rx/d;

    invoke-static {v0}, Lorg/greenrobot/greendao/rx/d;->d(Lorg/greenrobot/greendao/rx/d;)Lorg/greenrobot/greendao/c;

    move-result-object v0

    iget-object v1, p0, Lorg/greenrobot/greendao/rx/d$b;->a:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Lorg/greenrobot/greendao/c;->callInTx(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
