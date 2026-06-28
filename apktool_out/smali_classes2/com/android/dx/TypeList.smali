.class final Lcom/android/dx/TypeList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final ropTypes:Lcom/android/dx/rop/type/StdTypeList;

.field final types:[Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/android/dx/TypeId<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>([Lcom/android/dx/TypeId;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/android/dx/TypeId<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, [Lcom/android/dx/TypeId;->clone()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [Lcom/android/dx/TypeId;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/rop/type/StdTypeList;

    .line 13
    .line 14
    array-length v1, p1

    .line 15
    invoke-direct {v0, v1}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/TypeList;->ropTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    array-length v1, p1

    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/TypeList;->ropTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 25
    .line 26
    aget-object v2, p1, v0

    .line 27
    .line 28
    iget-object v2, v2, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
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


# virtual methods
.method public asList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dx/TypeId<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/android/dx/TypeList;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/android/dx/TypeList;

    iget-object p1, p1, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    iget-object v0, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
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
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    const-string v2, ", "

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v2, p0, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    .line 20
    .line 21
    aget-object v2, v2, v1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
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
