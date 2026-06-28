.class public abstract Lcom/umeng/analytics/pro/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/br;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/cb$c;,
        Lcom/umeng/analytics/pro/cb$d;,
        Lcom/umeng/analytics/pro/cb$a;,
        Lcom/umeng/analytics/pro/cb$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/umeng/analytics/pro/cb<",
        "**>;F::",
        "Lcom/umeng/analytics/pro/by;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/br<",
        "TT;TF;>;"
    }
.end annotation


# static fields
.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/umeng/analytics/pro/cy;",
            ">;",
            "Lcom/umeng/analytics/pro/cz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Ljava/lang/Object;

.field protected b:Lcom/umeng/analytics/pro/by;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TF;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/umeng/analytics/pro/cb;->c:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v1, Lcom/umeng/analytics/pro/cb$b;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lcom/umeng/analytics/pro/cb$b;-><init>(Lcom/umeng/analytics/pro/cb$1;)V

    .line 12
    .line 13
    .line 14
    const-class v3, Lcom/umeng/analytics/pro/da;

    .line 15
    .line 16
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    new-instance v1, Lcom/umeng/analytics/pro/cb$d;

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lcom/umeng/analytics/pro/cb$d;-><init>(Lcom/umeng/analytics/pro/cb$1;)V

    .line 22
    .line 23
    .line 24
    const-class v2, Lcom/umeng/analytics/pro/db;

    .line 25
    .line 26
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 3
    iput-object v0, p0, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V

    return-void
.end method

.method protected constructor <init>(Lcom/umeng/analytics/pro/cb;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/umeng/analytics/pro/cb<",
            "TT;TF;>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p1, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    iput-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 9
    iget-object p1, p1, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcom/umeng/analytics/pro/cb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/umeng/analytics/pro/br;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lcom/umeng/analytics/pro/br;

    invoke-interface {p0}, Lcom/umeng/analytics/pro/br;->deepCopy()Lcom/umeng/analytics/pro/br;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-static {p0}, Lcom/umeng/analytics/pro/bs;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    .line 5
    :cond_1
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 6
    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lcom/umeng/analytics/pro/cb;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 7
    :cond_2
    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_3

    .line 8
    check-cast p0, Ljava/util/Set;

    invoke-static {p0}, Lcom/umeng/analytics/pro/cb;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 9
    :cond_3
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 10
    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Lcom/umeng/analytics/pro/cb;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 19
    invoke-static {v1}, Lcom/umeng/analytics/pro/cb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static a(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map;"
        }
    .end annotation

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 13
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/analytics/pro/cb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/analytics/pro/cb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static a(Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 14
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 16
    invoke-static {v1}, Lcom/umeng/analytics/pro/cb;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/umeng/analytics/pro/by;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TF;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    return-object v0
.end method

.method protected abstract a(S)Lcom/umeng/analytics/pro/by;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S)TF;"
        }
    .end annotation
.end method

.method public a(I)Ljava/lang/Object;
    .locals 0

    int-to-short p1, p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cb;->a(S)Lcom/umeng/analytics/pro/by;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    if-ne p1, v0, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cb;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot get the value of field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because union\'s set field is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/cl;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method

.method protected abstract a(Lcom/umeng/analytics/pro/cq;S)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method

.method public a(ILjava/lang/Object;)V
    .locals 0

    int-to-short p1, p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cb;->a(S)Lcom/umeng/analytics/pro/by;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb;->a(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/cb;->b(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V

    .line 26
    iput-object p1, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 27
    iput-object p2, p0, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    return-void
.end method

.method protected abstract a(Lcom/umeng/analytics/pro/cq;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract b(Lcom/umeng/analytics/pro/by;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassCastException;
        }
    .end annotation
.end method

.method protected abstract b(Lcom/umeng/analytics/pro/cq;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation
.end method

.method public b(I)Z
    .locals 0

    int-to-short p1, p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cb;->a(S)Lcom/umeng/analytics/pro/by;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/cb;->b(Lcom/umeng/analytics/pro/by;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/umeng/analytics/pro/by;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)Z"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected abstract c(Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Lcom/umeng/analytics/pro/cl;"
        }
    .end annotation
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/umeng/analytics/pro/cb;->b:Lcom/umeng/analytics/pro/by;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/umeng/analytics/pro/cb;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method protected abstract d()Lcom/umeng/analytics/pro/cv;
.end method

.method public read(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/analytics/pro/cb;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cz;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cz;->b()Lcom/umeng/analytics/pro/cy;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cy;->b(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "<"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cb;->a()Lcom/umeng/analytics/pro/by;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cb;->b()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/cb;->a()Lcom/umeng/analytics/pro/by;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0, v2}, Lcom/umeng/analytics/pro/cb;->c(Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, Lcom/umeng/analytics/pro/cl;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v2, ":"

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    instance-of v2, v1, Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bs;->a(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_1
    :goto_0
    const-string v1, ">"

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public write(Lcom/umeng/analytics/pro/cq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    sget-object v0, Lcom/umeng/analytics/pro/cb;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cz;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cz;->b()Lcom/umeng/analytics/pro/cy;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cy;->a(Lcom/umeng/analytics/pro/cq;Lcom/umeng/analytics/pro/br;)V

    return-void
.end method
