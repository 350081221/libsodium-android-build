.class Lorg/greenrobot/greendao/rx/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/greenrobot/greendao/rx/b;->g()Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/greenrobot/greendao/rx/b;


# direct methods
.method constructor <init>(Lorg/greenrobot/greendao/rx/b;)V
    .locals 0

    iput-object p1, p0, Lorg/greenrobot/greendao/rx/b$i;->a:Lorg/greenrobot/greendao/rx/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/greenrobot/greendao/rx/b$i;->a:Lorg/greenrobot/greendao/rx/b;

    invoke-static {v0}, Lorg/greenrobot/greendao/rx/b;->d(Lorg/greenrobot/greendao/rx/b;)Lorg/greenrobot/greendao/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->deleteAll()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/greenrobot/greendao/rx/b$i;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
