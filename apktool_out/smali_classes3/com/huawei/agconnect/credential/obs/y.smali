.class public Lcom/huawei/agconnect/credential/obs/y;
.super Lcom/huawei/agconnect/common/api/BaseRequest;
.source "SourceFile"


# static fields
.field private static final REQUEST_URL:Ljava/lang/String; = "http://localhost/agc/apigw/oauth2/v1/token"
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Url;
    .end annotation
.end field


# instance fields
.field private app_id:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Header;
        value = "app_id"
    .end annotation
.end field

.field private client_id:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Field;
        value = "client_id"
    .end annotation
.end field

.field private client_secret:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Field;
        value = "client_secret"
    .end annotation
.end field

.field private grant_type:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Field;
        value = "grant_type"
    .end annotation
.end field

.field private useJwt:I
    .annotation runtime Lcom/huawei/agconnect/https/annotation/Field;
        value = "useJwt"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/AGConnectInstance;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/common/api/BaseRequest;-><init>(Lcom/huawei/agconnect/AGConnectInstance;)V

    const-string v0, "client_credentials"

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->grant_type:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/agconnect/credential/obs/y;->useJwt:I

    const-string v0, "agconnect-credential"

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/common/api/BaseRequest;->setSdkServiceName(Ljava/lang/String;)V

    const-string v0, "1.7.2.300"

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/common/api/BaseRequest;->setSdkVersion(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object p1

    const-string v0, "client/app_id"

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->app_id:Ljava/lang/String;

    const-string v0, "client/client_id"

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->client_id:Ljava/lang/String;

    const-string v0, "client/client_secret"

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/y;->client_secret:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->app_id:Ljava/lang/String;

    return-object v0
.end method

.method public getClientId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->client_id:Ljava/lang/String;

    return-object v0
.end method

.method public getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->client_secret:Ljava/lang/String;

    return-object v0
.end method

.method public getGrantType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/y;->grant_type:Ljava/lang/String;

    return-object v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/y;->app_id:Ljava/lang/String;

    return-void
.end method

.method public setClientId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/y;->client_id:Ljava/lang/String;

    return-void
.end method

.method public setClientSecret(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/y;->client_secret:Ljava/lang/String;

    return-void
.end method
