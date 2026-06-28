.class Lorg/greenrobot/greendao/rx/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/greenrobot/greendao/rx/c;->e()Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/greenrobot/greendao/rx/c;


# direct methods
.method constructor <init>(Lorg/greenrobot/greendao/rx/c;)V
    .locals 0

    iput-object p1, p0, Lorg/greenrobot/greendao/rx/c$a;->a:Lorg/greenrobot/greendao/rx/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/rx/c$a;->a:Lorg/greenrobot/greendao/rx/c;

    invoke-static {v0}, Lorg/greenrobot/greendao/rx/c;->d(Lorg/greenrobot/greendao/rx/c;)Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/greenrobot/greendao/rx/c$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
