.class public Lorg/ahocorasick/trie/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lorg/ahocorasick/trie/d;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lorg/ahocorasick/trie/d;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lorg/ahocorasick/trie/d;

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lorg/ahocorasick/trie/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/ahocorasick/trie/d;->c:Ljava/util/Map;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lorg/ahocorasick/trie/d;->d:Lorg/ahocorasick/trie/d;

    .line 5
    iput-object v0, p0, Lorg/ahocorasick/trie/d;->e:Ljava/util/Set;

    .line 6
    iput p1, p0, Lorg/ahocorasick/trie/d;->a:I

    if-nez p1, :cond_0

    move-object v0, p0

    .line 7
    :cond_0
    iput-object v0, p0, Lorg/ahocorasick/trie/d;->b:Lorg/ahocorasick/trie/d;

    return-void
.end method

.method private j(Ljava/lang/Character;Z)Lorg/ahocorasick/trie/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ahocorasick/trie/d;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lorg/ahocorasick/trie/d;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p2, p0, Lorg/ahocorasick/trie/d;->b:Lorg/ahocorasick/trie/d;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    move-object p1, p2

    .line 18
    :cond_0
    return-object p1
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
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ahocorasick/trie/d;->e:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/TreeSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/ahocorasick/trie/d;->e:Ljava/util/Set;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lorg/ahocorasick/trie/d;->e:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public b(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/ahocorasick/trie/d;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public c(Ljava/lang/Character;)Lorg/ahocorasick/trie/d;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lorg/ahocorasick/trie/d;->k(Ljava/lang/Character;)Lorg/ahocorasick/trie/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lorg/ahocorasick/trie/d;

    .line 8
    .line 9
    iget v1, p0, Lorg/ahocorasick/trie/d;->a:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lorg/ahocorasick/trie/d;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lorg/ahocorasick/trie/d;->c:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public d()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/ahocorasick/trie/d;->e:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public e()Lorg/ahocorasick/trie/d;
    .locals 1

    iget-object v0, p0, Lorg/ahocorasick/trie/d;->d:Lorg/ahocorasick/trie/d;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lorg/ahocorasick/trie/d;->a:I

    return v0
.end method

.method public g()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/ahocorasick/trie/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/ahocorasick/trie/d;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/ahocorasick/trie/d;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/Character;)Lorg/ahocorasick/trie/d;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/ahocorasick/trie/d;->j(Ljava/lang/Character;Z)Lorg/ahocorasick/trie/d;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/Character;)Lorg/ahocorasick/trie/d;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/ahocorasick/trie/d;->j(Ljava/lang/Character;Z)Lorg/ahocorasick/trie/d;

    move-result-object p1

    return-object p1
.end method

.method public l(Lorg/ahocorasick/trie/d;)V
    .locals 0

    iput-object p1, p0, Lorg/ahocorasick/trie/d;->d:Lorg/ahocorasick/trie/d;

    return-void
.end method
