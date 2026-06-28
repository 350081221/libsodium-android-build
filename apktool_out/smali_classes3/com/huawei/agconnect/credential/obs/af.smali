.class public Lcom/huawei/agconnect/credential/obs/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/core/service/EndpointService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/credential/obs/af$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "EndpointServiceImpl"


# instance fields
.field private b:Lcom/huawei/agconnect/credential/obs/s;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/AGConnectInstance;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/huawei/agconnect/credential/obs/af;->c:Z

    invoke-virtual {p2}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object p1

    const-string v0, "agcgw/url"

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object p2

    const-string v0, "agcgw/backurl"

    invoke-interface {p2, v0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/huawei/agconnect/credential/obs/s;

    invoke-direct {v0, p1, p2}, Lcom/huawei/agconnect/credential/obs/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/o;->a()Lcom/huawei/agconnect/credential/obs/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/o;->b()Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/o;->a()Lcom/huawei/agconnect/credential/obs/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/o;->b()Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/agconnect/credential/obs/u;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/u;->b()Lcom/huawei/agconnect/credential/obs/s;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/o;->a()Lcom/huawei/agconnect/credential/obs/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/o;->b()Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/agconnect/credential/obs/u;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/u;->c()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/huawei/agconnect/credential/obs/af;->c:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public getEndpointDomain(Z)Lcom/huawei/hmf/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/huawei/agconnect/credential/obs/af;->c:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/huawei/hmf/tasks/k;

    invoke-direct {p1}, Lcom/huawei/hmf/tasks/k;-><init>()V

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/s;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/k;->b()Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/s;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/af;->b:Lcom/huawei/agconnect/credential/obs/s;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/agconnect/credential/obs/af$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/credential/obs/af$a;

    move-result-object p1

    invoke-static {p1}, Lcom/huawei/hmf/tasks/m;->f(Ljava/util/concurrent/Callable;)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    return-object p1
.end method
