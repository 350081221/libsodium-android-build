.class public Lx0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/b;->a(Landroid/content/Context;Lx0/b$b;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/b;


# direct methods
.method public constructor <init>(Lx0/b;)V
    .locals 0

    iput-object p1, p0, Lx0/b$a;->a:Lx0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 3
    .line 4
    invoke-static {p2}, Lv0/a$a;->a(Landroid/os/IBinder;)Lv0/a;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {p1, p2}, Lx0/b;->c(Lx0/b;Lv0/a;)Lv0/a;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 12
    .line 13
    invoke-static {p1}, Lx0/b;->d(Lx0/b;)Lx0/b$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 20
    .line 21
    invoke-static {p1}, Lx0/b;->d(Lx0/b;)Lx0/b$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lx0/b$a;->a:Lx0/b;

    .line 26
    .line 27
    const-string v0, "Deviceid Service Connected"

    .line 28
    .line 29
    invoke-interface {p1, v0, p2}, Lx0/b$b;->a(Ljava/lang/Object;Lx0/b;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 33
    .line 34
    const-string p2, "Service onServiceConnected"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lx0/b;->f(Lx0/b;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0

    .line 43
    throw p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lx0/b;->c(Lx0/b;Lv0/a;)Lv0/a;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lx0/b$a;->a:Lx0/b;

    .line 8
    .line 9
    const-string v0, "Service onServiceDisconnected"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lx0/b;->f(Lx0/b;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method
