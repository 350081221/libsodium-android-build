.class public Lcom/android/dx/cf/code/OneLocalsArray;
.super Lcom/android/dx/cf/code/LocalsArray;
.source "SourceFile"


# instance fields
.field private final locals:[Lcom/android/dx/rop/type/TypeBearer;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArray;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    new-array p1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    return-void
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
.end method

.method private static throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 3

    new-instance v0, Lcom/android/dx/cf/code/SimException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "local "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "<invalid>"

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "locals["

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, "]: "

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
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

.method public bridge synthetic copy()Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->copy()Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 5

    .line 2
    new-instance v0, Lcom/android/dx/cf/code/OneLocalsArray;

    iget-object v1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    array-length v1, v1

    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/OneLocalsArray;-><init>(I)V

    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    iget-object v2, v0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public get(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "invalid"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
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
.end method

.method public getCategory1(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isUninitialized()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string/jumbo v0, "uninitialized instance"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const-string v0, "category-2"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    return-object v0
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

.method public getCategory2(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->isCategory1()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v0, "category-1"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->throwSimException(ILjava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    return-object v0
    .line 23
    .line 24
.end method

.method public getMaxLocals()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    array-length v0, v0

    return v0
.end method

.method public getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method protected getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 0

    return-object p0
.end method

.method public invalidate(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v1, v0, p1

    .line 8
    .line 9
    return-void
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
    .line 24
.end method

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getInitializedType()Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v0, :cond_2

    .line 16
    .line 17
    iget-object v3, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    aget-object v4, v3, v2

    .line 20
    .line 21
    if-ne v4, p1, :cond_1

    .line 22
    .line 23
    aput-object v1, v3, v2

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return-void
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
.end method

.method public merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/cf/code/OneLocalsArray;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1, p0}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    move-result-object p1

    return-object p1
.end method

.method public merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 2

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->mergeLocals(Lcom/android/dx/cf/code/OneLocalsArray;Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object p1
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string/jumbo v1, "underlay locals:"

    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    const-string v1, "overlay locals:"

    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 9
    throw v0
.end method

.method public mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/android/dx/cf/code/LocalsArraySet;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public set(ILcom/android/dx/rop/type/TypeBearer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    :try_start_0
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_2

    .line 3
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    add-int/lit8 v2, p1, 0x1

    aput-object v1, v0, v2

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    aput-object p2, v0, p1

    if-eqz p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    .line 6
    aget-object p2, v0, p1

    if-eqz p2, :cond_1

    .line 7
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    aput-object v1, p2, p1

    :cond_1
    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "idx < 0"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public set(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 5

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
    iget-object v2, p0, Lcom/android/dx/cf/code/OneLocalsArray;->locals:[Lcom/android/dx/rop/type/TypeBearer;

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "<invalid>"

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "locals["

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v4, "]: "

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, "\n"

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
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
