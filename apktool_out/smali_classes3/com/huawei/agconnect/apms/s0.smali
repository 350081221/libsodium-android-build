.class public Lcom/huawei/agconnect/apms/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public abc:Ljava/lang/String;

.field public bcd:Ljava/lang/String;

.field public cde:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc()V
    .locals 1

    const-string v0, ""

    .line 5
    iput-object v0, p0, Lcom/huawei/agconnect/apms/s0;->abc:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/huawei/agconnect/apms/s0;->bcd:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/huawei/agconnect/apms/s0;->cde:Ljava/lang/String;

    return-void
.end method

.method public abc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/huawei/agconnect/apms/s0;->bcd:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/huawei/agconnect/apms/s0;->cde:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/s0;->abc:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public bcd()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/s0;->bcd:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/s0;->cde:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v4

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/huawei/agconnect/apms/s0;->abc:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return v4

    .line 33
    :cond_1
    return v3
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
