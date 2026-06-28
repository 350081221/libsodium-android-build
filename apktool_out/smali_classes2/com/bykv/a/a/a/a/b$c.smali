.class final Lcom/bykv/a/a/a/a/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/ValueSet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bykv/a/a/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field private c:I


# direct methods
.method private constructor <init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/bykv/a/a/a/a/b$c;->c:I

    .line 4
    iput-object p1, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 5
    iput-object p2, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method synthetic constructor <init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/a/a/a/a/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bykv/a/a/a/a/b$c;-><init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    return-void
.end method


# virtual methods
.method public arrayValue(ILjava/lang/Class;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Class<",
            "TT;>;)[TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->arrayValue(ILjava/lang/Class;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    return-object v1

    .line 20
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, [Ljava/lang/Object;

    .line 42
    .line 43
    :cond_2
    return-object v1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public booleanValue(I)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/bykv/a/a/a/a/b$c;->booleanValue(IZ)Z

    move-result p1

    return p1
.end method

.method public booleanValue(IZ)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->booleanValue(IZ)Z

    move-result p1

    return p1

    .line 5
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    move-result-object v0

    .line 6
    :cond_1
    instance-of p1, v0, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :cond_2
    return p2
.end method

.method public containsKey(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->containsKey(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1
    .line 24
.end method

.method public doubleValue(I)D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->doubleValue(I)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    instance-of p1, v0, Ljava/lang/Double;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Double;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    :goto_0
    return-wide v0
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

.method public floatValue(I)F
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/bykv/a/a/a/a/b$c;->floatValue(IF)F

    move-result p1

    return p1
.end method

.method public floatValue(IF)F
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->floatValue(IF)F

    move-result p1

    return p1

    .line 5
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    move-result-object v0

    .line 6
    :cond_1
    instance-of p1, v0, Ljava/lang/Float;

    if-eqz p1, :cond_2

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p2

    :cond_2
    return p2
.end method

.method public intValue(I)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/bykv/a/a/a/a/b$c;->intValue(II)I

    move-result p1

    return p1
.end method

.method public intValue(II)I
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(II)I

    move-result p1

    return p1

    .line 5
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    move-result-object v0

    .line 6
    :cond_1
    instance-of p1, v0, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :cond_2
    return p2
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/bykv/a/a/a/a/b$c;->size()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keys()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->keys()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, Lcom/bykv/a/a/a/a/b$c;->c:I

    .line 47
    .line 48
    return-object v1
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

.method public longValue(I)J
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/bykv/a/a/a/a/b$c;->longValue(IJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public longValue(IJ)J
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1, p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->longValue(IJ)J

    move-result-wide p1

    return-wide p1

    .line 5
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    move-result-object v0

    .line 6
    :cond_1
    instance-of p1, v0, Ljava/lang/Long;

    if-eqz p1, :cond_2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    :cond_2
    return-wide p2
.end method

.method public objectValue(ILjava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    return-object v1

    .line 20
    :cond_1
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    .line 25
    .line 26
    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    :cond_3
    return-object v1
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

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/a/a/a/a/b$c;->c:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/bykv/a/a/a/a/b$c;->keys()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/bykv/a/a/a/a/b$c;->c:I

    .line 9
    .line 10
    return v0
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
.end method

.method public stringValue(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/bykv/a/a/a/a/b$c;->stringValue(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public stringValue(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bykv/a/a/a/a/b$c;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bykv/a/a/a/a/b$c;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1, p1, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    instance-of p1, v0, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    if-eqz p1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;->get()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    .line 6
    :goto_0
    instance-of p1, p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    return-object p2
.end method
