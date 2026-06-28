.class public Lcom/huawei/agconnect/apms/pon;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/onm;


# instance fields
.field public final abc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/tsr;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

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
    .line 22
    .line 23
.end method


# virtual methods
.method public abc(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 3
    check-cast v1, Lcom/huawei/agconnect/apms/vut;

    .line 4
    iget-object v2, v1, Lcom/huawei/agconnect/apms/vut;->bcd:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 5
    check-cast v3, Lcom/huawei/agconnect/apms/qpo;

    .line 6
    iget v3, v3, Lcom/huawei/agconnect/apms/qpo;->abc:I

    const/4 v5, 0x1

    if-ge p1, v3, :cond_2

    move v3, v5

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    if-eqz v3, :cond_1

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_2
    if-eqz v5, :cond_4

    goto :goto_0

    .line 7
    :cond_4
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    iget v3, v1, Lcom/huawei/agconnect/apms/vut;->abc:I

    if-gt v2, v3, :cond_5

    .line 8
    invoke-virtual {v1, p1, p2, p3}, Lcom/huawei/agconnect/apms/vut;->abc(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_5
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    .line 10
    iget v3, v1, Lcom/huawei/agconnect/apms/vut;->abc:I

    add-int/2addr v3, v4

    :goto_3
    if-ge v4, v2, :cond_0

    .line 11
    invoke-virtual {p3, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, p1, p2, v4}, Lcom/huawei/agconnect/apms/vut;->abc(ILjava/lang/String;Ljava/lang/String;)V

    .line 12
    iget v4, v1, Lcom/huawei/agconnect/apms/vut;->abc:I

    add-int/2addr v4, v3

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    move v6, v4

    move v4, v3

    move v3, v6

    goto :goto_3

    :cond_6
    return-void
.end method

.method public abc(Lcom/huawei/agconnect/apms/tsr;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public abc(Ljava/lang/String;)V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 14
    check-cast v1, Lcom/huawei/agconnect/apms/uts;

    .line 15
    iget-object v1, v1, Lcom/huawei/agconnect/apms/uts;->def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    invoke-virtual {v1, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public flush()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/huawei/agconnect/apms/uts;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/huawei/agconnect/apms/uts;->def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->abc()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
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

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/huawei/agconnect/apms/uts;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/huawei/agconnect/apms/uts;->def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->bcd()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pon;->abc:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
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
