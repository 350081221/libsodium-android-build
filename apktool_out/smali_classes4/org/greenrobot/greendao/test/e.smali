.class public abstract Lorg/greenrobot/greendao/test/e;
.super Lorg/greenrobot/greendao/test/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lorg/greenrobot/greendao/a<",
        "TT;",
        "Ljava/lang/String;",
        ">;T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/greenrobot/greendao/test/d<",
        "TD;TT;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TD;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/greenrobot/greendao/test/d;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method protected J()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/greenrobot/greendao/test/f;->a:Ljava/util/Random;

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v0, :cond_0

    .line 18
    .line 19
    iget-object v3, p0, Lorg/greenrobot/greendao/test/f;->a:Ljava/util/Random;

    .line 20
    .line 21
    const/16 v4, 0x19

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/lit8 v3, v3, 0x61

    .line 28
    .line 29
    int-to-char v3, v3

    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method protected bridge synthetic m()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/greenrobot/greendao/test/e;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
