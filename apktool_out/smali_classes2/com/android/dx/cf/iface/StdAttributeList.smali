.class public final Lcom/android/dx/cf/iface/StdAttributeList;
.super Lcom/android/dx/util/FixedSizeList;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/iface/AttributeList;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    return-void
.end method


# virtual methods
.method public byteLength()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lcom/android/dx/cf/iface/StdAttributeList;->get(I)Lcom/android/dx/cf/iface/Attribute;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Attribute;->byteLength()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v1, v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1
.end method

.method public findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/iface/StdAttributeList;->get(I)Lcom/android/dx/cf/iface/Attribute;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Lcom/android/dx/cf/iface/Attribute;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
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
.end method

.method public findNext(Lcom/android/dx/cf/iface/Attribute;)Lcom/android/dx/cf/iface/Attribute;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    const/4 v2, 0x0

    .line 7
    if-ge v1, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/iface/StdAttributeList;->get(I)Lcom/android/dx/cf/iface/Attribute;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-ne v3, p1, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/android/dx/cf/iface/Attribute;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    if-ge v1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/iface/StdAttributeList;->get(I)Lcom/android/dx/cf/iface/Attribute;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Attribute;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    return-object v2

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    return-object v2
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

.method public get(I)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/dx/cf/iface/Attribute;

    return-object p1
.end method

.method public set(ILcom/android/dx/cf/iface/Attribute;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    return-void
.end method
