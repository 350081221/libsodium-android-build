.class Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/stock/ProxyBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ProxiedClass"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TU;>;"
        }
    .end annotation
.end field

.field final interfaces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field final requestedClassloader:Ljava/lang/ClassLoader;

.field final sharedClassLoader:Z


# direct methods
.method private constructor <init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/lang/ClassLoader;",
            "Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->clazz:Ljava/lang/Class;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->interfaces:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->requestedClassloader:Ljava/lang/ClassLoader;

    .line 6
    iput-boolean p4, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->sharedClassLoader:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;ZLcom/android/dx/stock/ProxyBuilder$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;-><init>(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    check-cast p1, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->clazz:Ljava/lang/Class;

    .line 22
    .line 23
    iget-object v3, p1, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->clazz:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->interfaces:Ljava/util/List;

    .line 28
    .line 29
    iget-object v3, p1, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->interfaces:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->requestedClassloader:Ljava/lang/ClassLoader;

    .line 38
    .line 39
    iget-object v3, p1, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->requestedClassloader:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget-boolean v2, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->sharedClassLoader:Z

    .line 44
    .line 45
    iget-boolean p1, p1, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->sharedClassLoader:Z

    .line 46
    .line 47
    if-ne v2, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v0, v1

    .line 51
    :goto_0
    return v0

    .line 52
    :cond_3
    :goto_1
    return v1
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

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->clazz:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->interfaces:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    iget-object v1, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->requestedClassloader:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v0, v1

    .line 21
    iget-boolean v1, p0, Lcom/android/dx/stock/ProxyBuilder$ProxiedClass;->sharedClassLoader:Z

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    return v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
