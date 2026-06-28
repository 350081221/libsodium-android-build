.class public Lcom/alipay/sdk/app/PayTask$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alipay/sdk/app/PayTask;->payInterceptorWithUrl(Ljava/lang/String;ZLcom/alipay/sdk/app/H5PayCallback;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/alipay/sdk/app/H5PayCallback;

.field public final synthetic d:Lcom/alipay/sdk/app/PayTask;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/app/PayTask;Ljava/lang/String;ZLcom/alipay/sdk/app/H5PayCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/alipay/sdk/app/PayTask$a;->d:Lcom/alipay/sdk/app/PayTask;

    iput-object p2, p0, Lcom/alipay/sdk/app/PayTask$a;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/alipay/sdk/app/PayTask$a;->b:Z

    iput-object p4, p0, Lcom/alipay/sdk/app/PayTask$a;->c:Lcom/alipay/sdk/app/H5PayCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Ly0/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask$a;->d:Lcom/alipay/sdk/app/PayTask;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/app/PayTask;)Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask$a;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "payInterceptorWithUrl"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Ly0/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask$a;->d:Lcom/alipay/sdk/app/PayTask;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask$a;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-boolean v3, p0, Lcom/alipay/sdk/app/PayTask$a;->b:Z

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3}, Lcom/alipay/sdk/app/PayTask;->h5Pay(Ly0/a;Ljava/lang/String;Z)Lh1/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "inc finished: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lh1/a;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "mspl"

    .line 48
    .line 49
    invoke-static {v2, v1}, La1/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask$a;->c:Lcom/alipay/sdk/app/H5PayCallback;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lcom/alipay/sdk/app/H5PayCallback;->onPayResult(Lh1/a;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method
