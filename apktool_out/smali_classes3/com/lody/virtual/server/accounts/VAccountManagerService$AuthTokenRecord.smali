.class final Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AuthTokenRecord"
.end annotation


# instance fields
.field public account:Landroid/accounts/Account;

.field public authToken:Ljava/lang/String;

.field private authTokenType:Ljava/lang/String;

.field public expiryEpochMillis:J

.field private packageName:Ljava/lang/String;

.field public userId:I


# direct methods
.method constructor <init>(ILandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->userId:I

    .line 10
    iput-object p2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->account:Landroid/accounts/Account;

    .line 11
    iput-object p3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    .line 12
    iput-object p4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->packageName:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(ILandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->userId:I

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->account:Landroid/accounts/Account;

    .line 4
    iput-object p3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->packageName:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authToken:Ljava/lang/String;

    .line 7
    iput-wide p6, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->expiryEpochMillis:J

    return-void
.end method

.method static synthetic access$700(Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;

    .line 18
    .line 19
    iget v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->userId:I

    .line 20
    .line 21
    iget v3, p1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->userId:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->account:Landroid/accounts/Account;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->account:Landroid/accounts/Account;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->packageName:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->packageName:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v0, v1

    .line 57
    :goto_0
    return v0

    .line 58
    :cond_3
    :goto_1
    return v1
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
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->userId:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->account:Landroid/accounts/Account;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/accounts/Account;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->authTokenType:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthTokenRecord;->packageName:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v0, v1

    .line 30
    return v0
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
