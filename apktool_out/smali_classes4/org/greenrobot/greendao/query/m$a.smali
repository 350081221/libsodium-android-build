.class public abstract Lorg/greenrobot/greendao/query/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/greenrobot/greendao/query/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/greenrobot/greendao/query/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field protected final a:Z

.field protected final b:Ljava/lang/Object;

.field protected final c:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/greenrobot/greendao/query/m$a;->a:Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/greenrobot/greendao/query/m$a;->b:Ljava/lang/Object;

    .line 4
    iput-object v0, p0, Lorg/greenrobot/greendao/query/m$a;->c:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$a;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lorg/greenrobot/greendao/query/m$a;->a:Z

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$a;->c:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lorg/greenrobot/greendao/query/m$a;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lorg/greenrobot/greendao/query/m$a;->a:Z

    .line 12
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$a;->c:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lorg/greenrobot/greendao/query/m$a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/greenrobot/greendao/query/m$a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Lorg/greenrobot/greendao/query/m$a;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    aget-object v3, v0, v2

    .line 20
    .line 21
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    :goto_1
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
