.class public La1/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:La1/h;


# direct methods
.method public constructor <init>(La1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, La1/h$e;->a:La1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La1/h;La1/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, La1/h$e;-><init>(La1/h;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object p1, p0, La1/h$e;->a:La1/h;

    .line 2
    .line 3
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "biz"

    .line 8
    .line 9
    const-string v1, "srvCon"

    .line 10
    .line 11
    invoke-static {p1, v0, v1}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La1/h$e;->a:La1/h;

    .line 15
    .line 16
    invoke-static {p1}, La1/h;->m(La1/h;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    monitor-enter p1

    .line 21
    :try_start_0
    iget-object v0, p0, La1/h$e;->a:La1/h;

    .line 22
    .line 23
    invoke-static {p2}, Lcom/alipay/android/app/IAlixPay$Stub;->asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IAlixPay;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {v0, p2}, La1/h;->b(La1/h;Lcom/alipay/android/app/IAlixPay;)Lcom/alipay/android/app/IAlixPay;

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, La1/h$e;->a:La1/h;

    .line 31
    .line 32
    invoke-static {p2}, La1/h;->m(La1/h;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->notify()V

    .line 37
    .line 38
    .line 39
    monitor-exit p1

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p2
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p1, p0, La1/h$e;->a:La1/h;

    .line 2
    .line 3
    invoke-static {p1}, La1/h;->h(La1/h;)Ly0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "biz"

    .line 8
    .line 9
    const-string v1, "srvDis"

    .line 10
    .line 11
    invoke-static {p1, v0, v1}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La1/h$e;->a:La1/h;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {p1, v0}, La1/h;->b(La1/h;Lcom/alipay/android/app/IAlixPay;)Lcom/alipay/android/app/IAlixPay;

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method
