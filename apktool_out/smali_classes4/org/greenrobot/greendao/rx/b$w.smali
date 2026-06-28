.class Lorg/greenrobot/greendao/rx/b$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/greenrobot/greendao/rx/b;->s([Ljava/lang/Object;)Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "[",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Object;

.field final synthetic b:Lorg/greenrobot/greendao/rx/b;


# direct methods
.method constructor <init>(Lorg/greenrobot/greendao/rx/b;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lorg/greenrobot/greendao/rx/b$w;->b:Lorg/greenrobot/greendao/rx/b;

    iput-object p2, p0, Lorg/greenrobot/greendao/rx/b$w;->a:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/rx/b$w;->b:Lorg/greenrobot/greendao/rx/b;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/greenrobot/greendao/rx/b;->d(Lorg/greenrobot/greendao/rx/b;)Lorg/greenrobot/greendao/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/greenrobot/greendao/rx/b$w;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/greenrobot/greendao/a;->insertOrReplaceInTx([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/greenrobot/greendao/rx/b$w;->a:[Ljava/lang/Object;

    .line 13
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

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/greenrobot/greendao/rx/b$w;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
