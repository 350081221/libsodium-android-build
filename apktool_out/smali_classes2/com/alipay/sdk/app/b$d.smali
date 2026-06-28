.class public final Lcom/alipay/sdk/app/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alipay/sdk/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Landroid/os/Bundle;

.field public final synthetic d:Lcom/alipay/sdk/app/b;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/app/b;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/alipay/sdk/app/b$d;->d:Lcom/alipay/sdk/app/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lcom/alipay/sdk/app/b$d;->a:I

    .line 4
    iput-object p3, p0, Lcom/alipay/sdk/app/b$d;->b:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/alipay/sdk/app/b$d;->c:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/alipay/sdk/app/b;ILjava/lang/String;Landroid/os/Bundle;Lcom/alipay/sdk/app/b$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/alipay/sdk/app/b$d;-><init>(Lcom/alipay/sdk/app/b;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/app/b$d;->d:Lcom/alipay/sdk/app/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alipay/sdk/app/b;->a(Lcom/alipay/sdk/app/b;)Lcom/alipay/sdk/app/b$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/alipay/sdk/app/b$d;->d:Lcom/alipay/sdk/app/b;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alipay/sdk/app/b;->a(Lcom/alipay/sdk/app/b;)Lcom/alipay/sdk/app/b$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/alipay/sdk/app/b$d;->a:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/alipay/sdk/app/b$d;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/alipay/sdk/app/b$d;->c:Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-interface {v0, v1, v2, v3}, Lcom/alipay/sdk/app/b$b;->a(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
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
.end method
