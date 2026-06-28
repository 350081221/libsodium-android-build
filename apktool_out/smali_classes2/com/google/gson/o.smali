.class public final Lcom/google/gson/o;
.super Lcom/google/gson/l;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/gson/internal/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/j<",
            "Ljava/lang/String;",
            "Lcom/google/gson/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/gson/l;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/gson/internal/j;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/gson/internal/j;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    .line 10
    .line 11
    return-void
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
.end method

.method private D(Ljava/lang/Object;)Lcom/google/gson/l;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/gson/n;->a:Lcom/google/gson/n;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/gson/r;

    invoke-direct {v0, p1}, Lcom/google/gson/r;-><init>(Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/Character;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/o;->D(Ljava/lang/Object;)Lcom/google/gson/l;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/o;->y(Ljava/lang/String;Lcom/google/gson/l;)V

    return-void
.end method

.method public B(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/o;->D(Ljava/lang/Object;)Lcom/google/gson/l;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/o;->y(Ljava/lang/String;Lcom/google/gson/l;)V

    return-void
.end method

.method public C(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/o;->D(Ljava/lang/Object;)Lcom/google/gson/l;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/o;->y(Ljava/lang/String;Lcom/google/gson/l;)V

    return-void
.end method

.method public E()Lcom/google/gson/o;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/gson/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/o;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/gson/internal/j;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/google/gson/l;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/gson/l;->a()Lcom/google/gson/l;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v3, v2}, Lcom/google/gson/o;->y(Ljava/lang/String;Lcom/google/gson/l;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
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

.method public F()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/google/gson/l;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0}, Lcom/google/gson/internal/j;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public G(Ljava/lang/String;)Lcom/google/gson/l;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/l;

    return-object p1
.end method

.method public H(Ljava/lang/String;)Lcom/google/gson/i;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/i;

    return-object p1
.end method

.method public I(Ljava/lang/String;)Lcom/google/gson/o;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/o;

    return-object p1
.end method

.method public J(Ljava/lang/String;)Lcom/google/gson/r;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/r;

    return-object p1
.end method

.method public K(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public L()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0}, Lcom/google/gson/internal/j;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public M(Ljava/lang/String;)Lcom/google/gson/l;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/l;

    return-object p1
.end method

.method public bridge synthetic a()Lcom/google/gson/l;
    .locals 1

    invoke-virtual {p0}, Lcom/google/gson/o;->E()Lcom/google/gson/o;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lcom/google/gson/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/google/gson/o;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    :goto_1
    return p1
    .line 24
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    invoke-virtual {v0}, Lcom/google/gson/internal/j;->size()I

    move-result v0

    return v0
.end method

.method public y(Ljava/lang/String;Lcom/google/gson/l;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lcom/google/gson/n;->a:Lcom/google/gson/n;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/google/gson/o;->a:Lcom/google/gson/internal/j;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public z(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/o;->D(Ljava/lang/Object;)Lcom/google/gson/l;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/o;->y(Ljava/lang/String;Lcom/google/gson/l;)V

    return-void
.end method
