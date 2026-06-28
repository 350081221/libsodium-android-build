.class public final Lcom/github/promeg/pinyinhelper/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/promeg/pinyinhelper/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field a:Lcom/github/promeg/pinyinhelper/j;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/promeg/pinyinhelper/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/promeg/pinyinhelper/h;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->b:Ljava/util/List;

    .line 4
    :cond_0
    new-instance p1, Lcom/github/promeg/pinyinhelper/b;

    invoke-direct {p1}, Lcom/github/promeg/pinyinhelper/b;-><init>()V

    iput-object p1, p0, Lcom/github/promeg/pinyinhelper/c$b;->a:Lcom/github/promeg/pinyinhelper/j;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/github/promeg/pinyinhelper/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/promeg/pinyinhelper/c$b;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/github/promeg/pinyinhelper/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->b:Ljava/util/List;

    return-object v0
.end method

.method b()Lcom/github/promeg/pinyinhelper/j;
    .locals 1

    iget-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->a:Lcom/github/promeg/pinyinhelper/j;

    return-object v0
.end method

.method c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/github/promeg/pinyinhelper/c$b;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/github/promeg/pinyinhelper/c$b;->b()Lcom/github/promeg/pinyinhelper/j;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Lcom/github/promeg/pinyinhelper/h;)Lcom/github/promeg/pinyinhelper/c$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->b:Ljava/util/List;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/github/promeg/pinyinhelper/c$b;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-object p0
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
