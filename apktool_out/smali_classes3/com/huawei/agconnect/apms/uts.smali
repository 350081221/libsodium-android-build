.class public Lcom/huawei/agconnect/apms/uts;
.super Lcom/huawei/agconnect/apms/vut;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/uts$abc;
    }
.end annotation


# instance fields
.field public final def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

.field public efg:Lcom/huawei/agconnect/apms/srq;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/uts$abc;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/vut;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    .line 5
    .line 6
    iget-object v1, p1, Lcom/huawei/agconnect/apms/uts$abc;->abc:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p1, Lcom/huawei/agconnect/apms/uts$abc;->def:I

    .line 9
    .line 10
    iget-object v3, p1, Lcom/huawei/agconnect/apms/uts$abc;->bcd:Ljava/lang/String;

    .line 11
    .line 12
    iget-boolean v4, p1, Lcom/huawei/agconnect/apms/uts$abc;->ghi:Z

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/huawei/agconnect/apms/uts;->def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    .line 18
    .line 19
    iget v0, p1, Lcom/huawei/agconnect/apms/uts$abc;->cde:I

    .line 20
    .line 21
    iget-object v1, p0, Lcom/huawei/agconnect/apms/vut;->cde:Lcom/huawei/agconnect/apms/qpo;

    .line 22
    .line 23
    iput v0, v1, Lcom/huawei/agconnect/apms/qpo;->abc:I

    .line 24
    .line 25
    iget-object v0, p1, Lcom/huawei/agconnect/apms/uts$abc;->efg:Ljava/util/List;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lcom/huawei/agconnect/apms/rqp;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/huawei/agconnect/apms/vut;->bcd:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p1, p1, Lcom/huawei/agconnect/apms/uts$abc;->fgh:Lcom/huawei/agconnect/apms/srq;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    iput-object p1, p0, Lcom/huawei/agconnect/apms/uts;->efg:Lcom/huawei/agconnect/apms/srq;

    .line 58
    .line 59
    :cond_2
    return-void
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
.end method


# virtual methods
.method public abc(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/uts;->def:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    iget-object v1, p0, Lcom/huawei/agconnect/apms/uts;->efg:Lcom/huawei/agconnect/apms/srq;

    invoke-virtual {v1, p1, p2, p3}, Lcom/huawei/agconnect/apms/srq;->abc(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->bcd(Ljava/lang/String;)V

    return-void
.end method
