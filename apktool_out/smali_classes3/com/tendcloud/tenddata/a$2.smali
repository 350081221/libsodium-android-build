.class final Lcom/tendcloud/tenddata/a$2;
.super Lcom/tendcloud/tenddata/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private isUrlUpdated:Z

.field private url:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/a;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/tendcloud/tenddata/a$2;->isUrlUpdated:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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


# virtual methods
.method public getCert()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getDataFolder()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/tendcloud/tenddata/a;->getDataFolder()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFileLimitType()I
    .locals 1

    invoke-super {p0}, Lcom/tendcloud/tenddata/a;->getFileLimitType()I

    move-result v0

    return v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    const-string v0, "tdsdk.cpatrk.net"

    return-object v0
.end method

.method public getIP()Ljava/lang/String;
    .locals 1

    const-string v0, "114.67.227.198"

    return-object v0
.end method

.method public getMessageFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "UNIFIED_SDK_JSON"

    return-object v0
.end method

.method public getRootFolder()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/tendcloud/tenddata/a;->getRootFolder()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/aa;->k:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/tendcloud/tenddata/a$2;->isUrlUpdated:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tendcloud/tenddata/a$2;->url:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    return-object v0
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
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/a$2;->isUrlUpdated:Z

    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/a$2;->url:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 25
    .line 26
    .line 27
.end method
