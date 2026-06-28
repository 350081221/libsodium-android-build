.class final Lcom/huawei/agconnect/credential/obs/p$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/p;->b(Lcom/huawei/agconnect/core/service/auth/Token;Lcom/huawei/agconnect/common/api/BaseRequest;Lcom/huawei/agconnect/common/api/BackendService$Options;Lcom/huawei/hmf/tasks/k;ILjava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/i<",
        "Lcom/huawei/agconnect/core/service/auth/Token;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/agconnect/common/api/BaseRequest;

.field final synthetic b:I

.field final synthetic c:Ljava/lang/Class;

.field final synthetic d:Lcom/huawei/hmf/tasks/k;

.field final synthetic e:Lcom/huawei/agconnect/common/api/BackendService$Options;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/hmf/tasks/k;Lcom/huawei/agconnect/common/api/BackendService$Options;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$11;->a:Lcom/huawei/agconnect/common/api/BaseRequest;

    iput p2, p0, Lcom/huawei/agconnect/credential/obs/p$11;->b:I

    iput-object p3, p0, Lcom/huawei/agconnect/credential/obs/p$11;->c:Ljava/lang/Class;

    iput-object p4, p0, Lcom/huawei/agconnect/credential/obs/p$11;->d:Lcom/huawei/hmf/tasks/k;

    iput-object p5, p0, Lcom/huawei/agconnect/credential/obs/p$11;->e:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/agconnect/core/service/auth/Token;)V
    .locals 4

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/p$11;->a:Lcom/huawei/agconnect/common/api/BaseRequest;

    invoke-interface {p1}, Lcom/huawei/agconnect/core/service/auth/Token;->getTokenString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/common/api/BaseRequest;->setAccessToken(Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$11;->a:Lcom/huawei/agconnect/common/api/BaseRequest;

    iget v0, p0, Lcom/huawei/agconnect/credential/obs/p$11;->b:I

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/p$11;->c:Ljava/lang/Class;

    iget-object v2, p0, Lcom/huawei/agconnect/credential/obs/p$11;->d:Lcom/huawei/hmf/tasks/k;

    iget-object v3, p0, Lcom/huawei/agconnect/credential/obs/p$11;->e:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/huawei/agconnect/credential/obs/p;->a(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/hmf/tasks/k;Lcom/huawei/agconnect/common/api/BackendService$Options;)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$11;->e:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-virtual {p1}, Lcom/huawei/agconnect/common/api/BackendService$Options;->getAccessTokenType()Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    move-result-object p1

    sget-object v0, Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;->EXPECT:Lcom/huawei/agconnect/common/api/BackendService$AccessTokenType;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$11;->d:Lcom/huawei/hmf/tasks/k;

    new-instance v0, Lcom/huawei/agconnect/exception/AGCServerException;

    const-string v1, "no user login"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/exception/AGCServerException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/huawei/agconnect/core/service/auth/Token;

    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/credential/obs/p$11;->a(Lcom/huawei/agconnect/core/service/auth/Token;)V

    return-void
.end method
